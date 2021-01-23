package irvine.math.expression;

import irvine.math.api.Ring;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Hold a literal constant in an expression
 * @author Sean A. Irvine
 * @param <N> type of number represented by this literal
 * @param <R> ring operating on this type
 */
public abstract class Literal<N, R extends Ring<N>> extends AbstractExpression {

  private final N mValue;
  private final R mRing;

  /**
   * Construct a new literal value in the specified ring.
   * @param value value of literal
   * @param ring ring of value
   */
  public Literal(final N value, final R ring) {
    mValue = value;
    mRing = ring;
    setEvaluated();
  }

  @Override
  public Expression performEval() {
    return this;
  }

  /**
   * The value of this literal.
   * @return the value
   */
  public N value() {
    return mValue;
  }

  /**
   * The ring operating on this literal.
   * @return the ring
   */
  public R ring() {
    return mRing;
  }

  /**
   * Coerce the given object (generally a number) to a number of the type of this literal.
   * @param obj object to coerce
   * @return coerced value
   */
  public abstract N coerce(final Object obj);

  /**
   * Create a type dependent literal.
   * @param value value to create literal for
   * @param <T> type of literal
   * @param <R> ring for computation
   * @return the literal
   */
  public static <T, R extends Ring<T>> Literal<T, R> create(final T value) {
    if (value instanceof Z) {
      return Coercion.force(new LiteralZ((Z) value));
    }
    if (value instanceof Q) {
      return Coercion.force(new LiteralQ((Q) value));
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    return this;
  }

  @Override
    public Expression diff(final Identifier var) {
    return LiteralZ.LIT_ZERO;
  }

  @Override
  public int complexity() {
    return 1;
  }

  @Override
  public Precedence precedence() {
    // todo this depends on the sign?
    return Precedence.ATOM;
  }

  /**
   * The sign of this literal.
   * @return the sign
   */
  public abstract int signum();

  @Override
  public boolean contains(final Expression expr) {
    return equals(expr);
  }

  @Override
  public String toString() {
    return value().toString();
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof Literal)) {
      return false;
    }
    final Literal<?, ?> that = (Literal<?, ?>) obj;
    return mValue.equals(that.mValue);
  }

  @Override
  public int hashCode() {
    return mValue.hashCode();
  }
}

package irvine.math.expression;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A literal rational.
 * @author Sean A. Irvine
 */
public class LiteralQ extends Literal<Q, Rationals> {

  /**
   * Construct a literal rational.
   * @param value the value of the rational
   */
  public LiteralQ(final Q value) {
    super(value, Rationals.SINGLETON);
  }

  @Override
  public Q coerce(final Object obj) {
    if (obj instanceof Q) {
      return (Q) obj;
    }
    if (obj instanceof Boolean) {
      return (Boolean) obj ? Q.ONE : Q.ZERO;
    }
    if (obj instanceof Z) {
      return new Q((Z) obj);
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public Expression eval() {
    // If this rational can be expressed as an integer then do so
    return value().isInteger() ? new LiteralZ(value().toZ()) : this;
  }

  @Override
  public int signum() {
    return value().signum();
  }
}

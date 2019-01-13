package irvine.math.expression;

/**
 * Hold an identifier.
 * @author Sean A. Irvine
 */
public class Identifier extends AbstractExpression {

  private final String mVar;

  /**
   * Construct an identifier with the given name.
   * @param var name of variable
   */
  public Identifier(final String var) {
    mVar = var;
    setEvaluated();
  }

  @Override
  public Expression performEval() {
    return this;
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    return equals(var) ? value : this;
  }

  @Override
    public Expression diff(final Identifier var) {
    return equals(var) ? LiteralZ.LIT_ONE : LiteralZ.LIT_ZERO;
  }

  @Override
  public int complexity() {
    return 2;
  }

  @Override
  public Precedence precedence() {
    return Precedence.ATOM;
  }

  @Override
  public boolean contains(final Expression expr) {
    return equals(expr);
  }

  @Override
  public boolean equals(final Object obj) {
    return obj instanceof Identifier && mVar.equals(((Identifier) obj).mVar);
  }

  @Override
  public int hashCode() {
    return mVar.hashCode();
  }

  @Override
  public String toString() {
    return mVar;
  }

}

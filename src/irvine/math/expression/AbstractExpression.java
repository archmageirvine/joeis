package irvine.math.expression;

/**
 * Base class for expressions.
 * @author Sean A. Irvine
 */
public abstract class AbstractExpression implements Expression {

  private boolean mIsEvaluated = false;

  protected abstract <T> Expression performEval();

  @Override
  public <T> Expression eval() {
    if (mIsEvaluated) {
      return this;
    }
    final Expression eval = performEval();
    eval.setEvaluated();
    return eval;
  }

  @Override
  public void setEvaluated() {
    mIsEvaluated = true;
  }

  @Override
  public Expression expand() {
    return this;
  }
}

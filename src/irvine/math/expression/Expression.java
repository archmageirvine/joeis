package irvine.math.expression;

/**
 * Definition of an expression.
 * @author Sean A. Irvine
 */
public interface Expression {

  /**
   * Return the evaluation of this expression.
   * @return evaluation of expression
   * @param <T> type of expression
   */
  <T> Expression eval();

  /**
   * Substitute a value for a variable in this expression.
   * @param var variable to substitute
   * @param value expression for the variable
   * @return substituted expression
   */
  Expression substitute(final Identifier var, final Expression value);

  /**
   * Return the derivative of this expression with respect to the given variable.
   * @param var variable
   * @return the derivative of this expression
   */
  Expression diff(final Identifier var);

  /**
   * Attempt to expand this expression.
   * @return expanded expression
   */
  Expression expand();

  /**
   * Mark the expression as having been evaluated.
   */
  void setEvaluated();

  /**
   * A number representing the overall complexity of this expression
   * @return complexity
   */
  int complexity();

  /**
   * Return the precedence class for this expression.
   * @return precedence class
   */
  Precedence precedence();

  /**
   * Test if this expression contains some other expression.
   * @param expr expression to test
   * @return true iff this expression contains the given expression
   */
  boolean contains(final Expression expr);
}

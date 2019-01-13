package irvine.math.expression;

/**
 * Interface for terms containing two expressions.
 * @author Sean A. Irvine
 */
public interface LeftRight {

  /**
   * Left term of expression.
   * @return left term
   */
  Expression left();

  /**
   * Right term of expression
   * @return right term
   */
  Expression right();
}

package irvine.math.expression;

/**
 * A precedence hierarchy used in the printing of expressions.
 * @author Sean A. Irvine.
 */
enum Precedence {
  /** Addition, subtraction */
  ADD,
  /** Multiplication, division, modulo. */
  MULTIPLY,
  /** Powers. */
  POWER,
  /** Function. */
  FUNCTION,
  /** Constants, literals. */
  ATOM;
}

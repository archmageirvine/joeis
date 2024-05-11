package irvine.math.predicate;

/**
 * Convenience class collecting together available predicates.
 * @author Sean A. Irvine
 */
public final class Predicates {

  private Predicates() { }

  /** Test if a number is a square. */
  public static final Predicate SQUARE = new Square();
  /** Test if a number is a cube. */
  public static final Predicate CUBE = new Cube();
  /** Test if a number is triangular. */
  public static final Predicate TRIANGULAR = new Triangular();
}

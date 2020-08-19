package irvine.math.lattice;

/**
 * Singleton constants for various lattices.
 * @author Sean A. Irvine
 */
public class Lattices {

  private Lattices() { }

  /** The 4-dimensional hypercubic lattice. */
  public static final Lattice Z4 = new Z4Lattice();
  /** The 5-dimensional hypercubic lattice. */
  public static final Lattice Z5 = new Z5Lattice();
  /** The 6-dimensional hypercubic lattice. */
  public static final Lattice Z6 = new Z6Lattice();
}

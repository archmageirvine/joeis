package irvine.math.lattice;

/**
 * Singleton constants for various lattices.
 * @author Sean A. Irvine
 */
public final class Lattices {

  private Lattices() { }

  /** The 2-dimensional square lattice (also called the quadratic lattice). */
  public static final Lattice Z2 = new SquareLattice();
  /** The 3-dimensional cubic lattice. */
  public static final Lattice Z3 = new CubicLattice();
  /** The 4-dimensional hypercubic lattice. */
  public static final Lattice Z4 = new Z4Lattice();
  /** The 5-dimensional hypercubic lattice. */
  public static final Lattice Z5 = new Z5Lattice();
  /** The 6-dimensional hypercubic lattice. */
  public static final Lattice Z6 = new Z6Lattice();

  // Other 2D lattices

  /** The hexagonal lattice (also called triangular lattice). */
  public static final Lattice HEXAGONAL = new HexagonalLattice();
  /** The honeycomb lattice. */
  public static final Lattice HONEYCOMB = new HoneycombLattice();

  /** The Kagome lattice. */
  public static final Lattice KAGOME = new KagomeLattice();
  /** The Manhattan lattice. */
  public static final Lattice MANHATTAN = new ManhattanLattice();
  /** The half-Manhattan lattice. */
  public static final Lattice HALF_MANHATTAN = new HalfManhattanLattice();
  /** The L lattice. */
  public static final Lattice L = new LLattice();

  // Other 3D lattices

  /** The face-centered cubic (f.c.c.) lattice. */
  public static final Lattice FCC = new FccLattice();
  /** The body-centered cubic (b.c.c.) lattice. */
  public static final Lattice BCC = new BccLattice();

}

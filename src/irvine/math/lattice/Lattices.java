package irvine.math.lattice;

/**
 * Singleton constants for various lattices.
 * @author Sean A. Irvine
 */
public final class Lattices {

  private Lattices() { }

  /** Integer line. */
  public static final Lattice Z1 = new LinearLattice();
  /** The 2-dimensional square lattice (also called the quadratic lattice). */
  public static final Lattice Z2 = new SquareLattice();
  /** The 3-dimensional cubic lattice. */
  public static final Lattice Z3 = new CubicLattice();
  /** The 4-dimensional hypercubic lattice. */
  public static final Lattice Z4 = new Z4Lattice();
  /** The 5-dimensional hypercubic lattice. */
  public static final Lattice Z5 = new Z5Lattice();

  // Other 2D lattices

  /** The hexagonal lattice (also called triangular lattice). */
  public static final Lattice HEXAGONAL = new HexagonalLattice();
  /** The honeycomb lattice. */
  public static final Lattice HONEYCOMB = new HoneycombLattice();
  /** The square lattice also allowing diagonal movement. */
  public static final Lattice Z2Q = new Z2QLattice();

  /** The Kagome lattice. */
  public static final Lattice KAGOME = new KagomeLattice();
  /** The Manhattan lattice. */
  public static final Lattice MANHATTAN = new ManhattanLattice();
  /** The half-Manhattan lattice. */
  public static final Lattice HALF_MANHATTAN = new HalfManhattanLattice();
  /** The partially directed square lattice. */
  public static final Lattice Z2PD = new Z2PDLattice();
  /** The L lattice. */
  public static final Lattice L = new LLattice();
  /** Chess knight. */
  public static final Lattice KNIGHT = new KnightLattice();
  /** Pon lattice. */
  public static final Lattice PON = new PonLattice();


  // Other 3D lattices

  /** The face-centered cubic (f.c.c.) lattice. */
  public static final Lattice FCC = new FccLattice();
  /** The body-centered cubic (b.c.c.) lattice. */
  public static final Lattice BCC = new BccLattice();
  /** The hydrogen peroxide lattice. */
  public static final Lattice HYDROGEN_PEROXIDE = new HydrogenPeroxideLattice();
  /** The hypertriangular lattice. */
  public static final Lattice HYPERTRIANGULAR = new HypertriangularLattice();
  /** Lonsdaleite. */
  public static final Lattice LONSDALEITE = new Lonsdaleite();

  // Others

  /** Diamond lattice (using 4-dimensional coordinates). */
  public static final Lattice DIAMOND = new DiamondLattice();
  /** Pyrochlore lattice (using 4-dimensional coordinates). */
  public static final Lattice PYROCHLORE = new PyrochloreLattice();

  /**
   * Construct a finite rectangular grid.
   * @param x width
   * @param y height
   * @return grid
   */
  public static Lattice grid(final long x, final long y) {
    return new Grid(x, y);
  }

  private static final Lattice[] HYPERCUBIC_LATTICES = {
    null, Z1, Z2, Z3, Z4, Z5,
  };

  /**
   * Return the hypercubic lattice of specified dimension.
   * @param dimension the dimension
   * @return lattice
   */
  public static Lattice hypercubic(final int dimension) {
    if (dimension < 1) {
      throw new IllegalArgumentException();
    }
    if (dimension >= HYPERCUBIC_LATTICES.length) {
      return new ZnLattice(dimension);
    }
    return HYPERCUBIC_LATTICES[dimension];
  }
}

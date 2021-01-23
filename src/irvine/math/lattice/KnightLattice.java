package irvine.math.lattice;

/**
 * Two-dimensional movement like a chess knight.
 * @author Sean A. Irvine
 */
class KnightLattice extends SquareLattice {

  private static final long[] DELTAS = {2 + Y1, -2 + Y1, 2 - Y1, -2 - Y1, 1 + 2 * Y1, 1 - 2 * Y1, -1 + 2 * Y1, -1 - 2 * Y1};

  @Override
  public int neighbourCount(final long point) {
    return 8;
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    return point + DELTAS[neighbourNumber];
  }

}

/*
      polyomino.trySquare(k, 2, 1, list, h, hc);
      polyomino.trySquare(k, -2, 1, list, h, hc);
      polyomino.trySquare(k, 2, -1, list, h, hc);
      polyomino.trySquare(k, -2, -1, list, h, hc);
      polyomino.trySquare(k, 1, 2, list, h, hc);
      polyomino.trySquare(k, 1, -2, list, h, hc);
      polyomino.trySquare(k, -1, 2, list, h, hc);
      polyomino.trySquare(k, -1, -2, list, h, hc);

 */

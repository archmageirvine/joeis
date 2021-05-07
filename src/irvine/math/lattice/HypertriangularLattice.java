package irvine.math.lattice;

/**
 * The hydrogen peroxide lattice.
 * @author Sean A. Irvine
 */
class HypertriangularLattice extends CubicLattice {

  private static final long[][] DELTAS = {
    {-1 - Y1 - 2 * Z1, 1 - 2 * Y1 - Z1, 1 + 2 * Y1 - Z1, -2 + Y1 + Z1, 2 + Y1 + Z1, -1 - Y1 + 2 * Z1}, // 00000 = 0 = "A"
    null, // 1
    null, // 2
    null, // 3
    null, // 4
    {1 + Y1 - 2 * Z1, -1 - 2 * Y1 - Z1, -1 + 2 * Y1 - Z1, -2 - Y1 + Z1, 2 - Y1 + Z1, 1 + Y1 + 2 * Z1}, // 000101 = 5 = "B"
    null, // 6
    null, // 7
    null, // 8
    null, // 9
    null, // 10
    null, // 11
    null, // 12
    null, // 13
    null, // 14
    null, // 15
    null, // 16
    null, // 17
    null, // 18
    {1 - Y1 - 2 * Z1, -2 + Y1 - Z1, 2 + Y1 - Z1, -1 - 2 * Y1 + Z1, -1 + 2 * Y1 + Z1, 1 - Y1 + 2 * Z1}, // 010011 = 19 = "D"
    null, // 20
    null, // 21
    {-1 + Y1 - 2 * Z1, -2 - Y1 - Z1, 2 - Y1 - Z1, 1 - 2 * Y1 + Z1, 1 + 2 * Y1 + Z1, -1 + Y1 + 2 * Z1}, // 010110 = 22 = "C"
    null, // 23
    null, // 24
    null, // 25
    null, // 26
    null, // 27
    null, // 28
    null, // 29
    null, // 30
    null, // 31
    null, // 32
    null, // 33
    null, // 34
    null, // 35
    null, // 36
    null, // 37
    null, // 38
    null, // 39
    null, // 40
    null, // 41
    {-1 - Y1 - 2 * Z1, 1 - 2 * Y1 - Z1, 1 + 2 * Y1 - Z1, -2 + Y1 + Z1, 2 + Y1 + Z1, -1 - Y1 + 2 * Z1}, // 101010 = 42 = "G"
    null, // 43
    null, // 44
    null, // 45
    null, // 46
    {1 + Y1 - 2 * Z1, -1 - 2 * Y1 - Z1, -1 + 2 * Y1 - Z1, -2 - Y1 + Z1, 2 - Y1 + Z1, 1 + Y1 + 2 * Z1}, // 101111 = 47 = "H"
    null, // 48
    null, // 49
    null, // 50
    null, // 51
    null, // 52
    null, // 53
    null, // 54
    null, // 55
    null, // 56
    {1 - Y1 - 2 * Z1, -2 + Y1 - Z1, 2 + Y1 - Z1, -1 - 2 * Y1 + Z1, -1 + 2 * Y1 + Z1, 1 - Y1 + 2 * Z1}, // 111001 = 58 = "F"
    null, // 58
    null, // 59
    {-1 + Y1 - 2 * Z1, -2 - Y1 - Z1, 2 - Y1 - Z1, 1 - 2 * Y1 + Z1, 1 + 2 * Y1 + Z1, -1 + Y1 + 2 * Z1}, // 111100 = 60 = "E"
  };

  @Override
  public int neighbourCount(final long point) {
    return 6;
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    // Key is (x mod 4, y mod 4, z mod 4)
    final long key = (point & 0b11) + ((point >> (BITS_PER_COORDINATE - 2)) & 0b1100) + ((point >> (2 * BITS_PER_COORDINATE - 4)) & 0b110000);
    return point + DELTAS[(int) key][neighbourNumber];
  }
}

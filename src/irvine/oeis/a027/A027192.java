package irvine.oeis.a027;

/**
 * A027192 Number of partitions of n into an odd number of parts, the least being 6; also, a(n+6) = number of partitions of n into an even number of parts, each &gt;=6.
 * @author Sean A. Irvine
 */
public class A027192 extends A027188 {

  @Override
  protected int start() {
    return -6;
  }

  @Override
  protected int leastPart() {
    return 6;
  }
}

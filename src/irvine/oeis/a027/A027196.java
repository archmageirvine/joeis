package irvine.oeis.a027;

/**
 * A027196 Number of partitions of n into an even number of parts, the least being 4; also, a(n+4) = number of partitions of n into an odd number of parts, each &gt;=4.
 * @author Sean A. Irvine
 */
public class A027196 extends A027194 {

  @Override
  protected int leastPart() {
    return 4;
  }
}

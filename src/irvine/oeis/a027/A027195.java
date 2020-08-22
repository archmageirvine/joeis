package irvine.oeis.a027;

/**
 * A027195 Number of partitions of n into an even number of parts, the least being 3; also, a(n+3) = number of partitions of n into an odd number of parts, each &gt;=3.
 * @author Sean A. Irvine
 */
public class A027195 extends A027194 {

  @Override
  protected int leastPart() {
    return 3;
  }
}

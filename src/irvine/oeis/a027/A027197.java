package irvine.oeis.a027;

/**
 * A027197 Number of partitions of n into an even number of parts, the least being 5; also, a(n+5) = number of partitions of n into an odd number of parts, each &gt;=5.
 * @author Sean A. Irvine
 */
public class A027197 extends A027194 {

  @Override
  protected int leastPart() {
    return 5;
  }
}

package irvine.oeis.a027;

/**
 * A027190 Number of partitions of n into an odd number of parts, the least being 4; also, <code>a(n+4) =</code> number of partitions of n into an even number of parts, each <code>&gt;=4</code>.
 * @author Sean A. Irvine
 */
public class A027190 extends A027188 {

  @Override
  protected int start() {
    return -4;
  }

  @Override
  protected int leastPart() {
    return 4;
  }
}

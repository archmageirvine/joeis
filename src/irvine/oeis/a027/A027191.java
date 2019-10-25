package irvine.oeis.a027;

/**
 * A027191 Number of partitions of n into an odd number of parts, the least being 5; also, <code>a(n+5) =</code> number of partitions of n into an even number of parts, each <code>&gt;=5</code>.
 * @author Sean A. Irvine
 */
public class A027191 extends A027188 {

  @Override
  protected int start() {
    return -5;
  }

  @Override
  protected int leastPart() {
    return 5;
  }
}

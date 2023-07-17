package irvine.oeis.a027;

/**
 * A027189 Number of partitions of n into an odd number of parts, the least being 3; also, a(n+3) = number of partitions of n into an even number of parts, each &gt;=3.
 * @author Sean A. Irvine
 */
public class A027189 extends A027188 {

  /** Construct the sequence. */
  public A027189() {
    super(1);
  }

  @Override
  protected int leastPart() {
    return 3;
  }
}

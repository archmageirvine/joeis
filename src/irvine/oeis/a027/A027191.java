package irvine.oeis.a027;

/**
 * A027191 Number of partitions of n into an odd number of parts, the least being 5; also, a(n+5) = number of partitions of n into an even number of parts, each &gt;=5.
 * @author Sean A. Irvine
 */
public class A027191 extends A027188 {

  /** Construct the sequence. */
  public A027191() {
    super(1);
  }

  @Override
  protected int start() {
    return -5;
  }

  @Override
  protected int leastPart() {
    return 5;
  }
}

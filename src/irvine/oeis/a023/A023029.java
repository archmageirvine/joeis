package irvine.oeis.a023;

/**
 * A023029 Number of partitions of n into 9 unordered relatively prime parts.
 * @author Sean A. Irvine
 */
public class A023029 extends A023024 {

  /** Construct the sequence. */
  public A023029() {
    super(9);
  }

  @Override
  protected int parts() {
    return 9;
  }
}

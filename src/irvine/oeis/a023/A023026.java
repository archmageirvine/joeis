package irvine.oeis.a023;

/**
 * A023026 Number of partitions of n into 6 unordered relatively prime parts.
 * @author Sean A. Irvine
 */
public class A023026 extends A023024 {

  /** Construct the sequence. */
  public A023026() {
    super(6);
  }

  @Override
  protected int parts() {
    return 6;
  }
}

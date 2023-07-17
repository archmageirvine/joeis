package irvine.oeis.a023;

/**
 * A023030 Number of partitions of n into 10 unordered relatively prime parts.
 * @author Sean A. Irvine
 */
public class A023030 extends A023024 {

  /** Construct the sequence. */
  public A023030() {
    super(10);
  }

  @Override
  protected int parts() {
    return 10;
  }
}

package irvine.oeis.a023;

/**
 * A023028 Number of partitions of n into 8 unordered relatively prime parts.
 * @author Sean A. Irvine
 */
public class A023028 extends A023024 {

  /** Construct the sequence. */
  public A023028() {
    super(8);
  }

  @Override
  protected int parts() {
    return 8;
  }
}

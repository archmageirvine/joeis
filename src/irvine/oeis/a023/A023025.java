package irvine.oeis.a023;

/**
 * A023025 Number of partitions of n into 5 unordered relatively prime parts.
 * @author Sean A. Irvine
 */
public class A023025 extends A023024 {

  /** Construct the sequence. */
  public A023025() {
    super(5);
  }

  @Override
  protected int parts() {
    return 5;
  }
}

package irvine.oeis.a023;

/**
 * A023027 Number of partitions of n into 7 unordered relatively prime parts.
 * @author Sean A. Irvine
 */
public class A023027 extends A023024 {

  /** Construct the sequence. */
  public A023027() {
    super(7);
  }

  @Override
  protected int parts() {
    return 7;
  }
}

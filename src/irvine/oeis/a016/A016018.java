package irvine.oeis.a016;

/**
 * A016018 Least k such that (tau(k^3)+2)/3=n.
 * @author Sean A. Irvine
 */
public class A016018 extends A016017 {

  /** Construct the sequence. */
  public A016018() {
    super(0);
  }

  @Override
  protected int v() {
    return 3;
  }
}

package irvine.oeis.a016;

/**
 * A016020 Least k such that (tau(k^4)+3)/4=n.
 * @author Sean A. Irvine
 */
public class A016020 extends A016017 {

  /** Construct the sequence. */
  public A016020() {
    super(0);
  }

  @Override
  protected int v() {
    return 4;
  }
}

package irvine.oeis.a030;

/**
 * A030311 Least k such that base 2 representation of n begins at <code>s(k)</code>, where <code>s=A030308</code>.
 * @author Sean A. Irvine
 */
public class A030311 extends A030320 {

  /** Construct the sequence. */
  public A030311() {
    super(new A030308(), -1);
  }
}

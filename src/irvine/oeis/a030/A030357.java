package irvine.oeis.a030;

/**
 * A030357 <code>a(n)=least</code> such that base 3 representation of n begins at <code>s(k)</code>, where <code>s=A030353</code>.
 * @author Sean A. Irvine
 */
public class A030357 extends A030335 {

  /** Construct the sequence. */
  public A030357() {
    super(new A030353(), 0);
  }
}


package irvine.oeis.a030;

/**
 * A030345 <code>a(n)=least</code> k such that base 3 representation of n begins at <code>s(k)</code>, where <code>s=A030341</code>.
 * @author Sean A. Irvine
 */
public class A030345 extends A030335 {

  /** Construct the sequence. */
  public A030345() {
    super(new A030341(), -1);
  }
}


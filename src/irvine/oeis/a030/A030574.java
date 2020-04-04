package irvine.oeis.a030;

/**
 * A030574 <code>a(n)=least</code> k such that base 6 representation of n begins at <code>s(k)</code>, where <code>s=A030567</code>.
 * @author Sean A. Irvine
 */
public class A030574 extends A030555 {

  /** Construct the sequence. */
  public A030574() {
    super(new A030567(), -1);
  }
}


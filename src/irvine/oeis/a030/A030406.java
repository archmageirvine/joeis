package irvine.oeis.a030;

/**
 * A030406 <code>a(n)=least</code> k such that base 4 representation of n begins at <code>s(k)</code>, where <code>s=A030401</code>.
 * @author Sean A. Irvine
 */
public class A030406 extends A030378 {

  /** Construct the sequence. */
  public A030406() {
    super(new A030401(), 0);
  }
}


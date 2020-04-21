package irvine.oeis.a031;

/**
 * A031275 <code>a(n)=least</code> k such that the base 5 representation of n begins at <code>s(k)</code>, where <code>s=A031269</code>.
 * @author Sean A. Irvine
 */
public class A031275 extends A031225 {

  /** Construct the sequence. */
  public A031275() {
    super(new A031269(), 0);
  }
}


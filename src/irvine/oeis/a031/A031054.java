package irvine.oeis.a031;

/**
 * A031054 <code>a(n)=least</code> k such that base 8 representation of n begins at <code>s(k)</code>, where <code>s=A031045</code>.
 * @author Sean A. Irvine
 */
public class A031054 extends A031044 {

  /** Construct the sequence. */
  public A031054() {
    super(new A031045(), -1);
  }
}


package irvine.oeis.a031;

/**
 * A031259 <code>a(n)=least</code> k such that base 5 representation of n begins at <code>s(k)</code>, where <code>s=A031253</code>.
 * @author Sean A. Irvine
 */
public class A031259 extends A031225 {

  /** Construct the sequence. */
  public A031259() {
    super(new A031253(), 0);
  }
}


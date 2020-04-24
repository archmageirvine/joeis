package irvine.oeis.a031;

/**
 * A031311 <code>a(n)=least</code> k such that base 10 representation of n begins at <code>s(k)</code>, where <code>s=A031310</code>.
 * @author Sean A. Irvine
 */
public class A031311 extends A031297 {

  /** Construct the sequence. */
  public A031311() {
    super(new A031310(), 0);
  }
}


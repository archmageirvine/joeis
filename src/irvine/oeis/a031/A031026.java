package irvine.oeis.a031;

/**
 * A031026 <code>a(n)=least</code> k such that the base 7 representation of n begins at <code>s(k)</code>, where <code>s=A031018</code>.
 * @author Sean A. Irvine
 */
public class A031026 extends A031006 {

  /** Construct the sequence. */
  public A031026() {
    super(new A031018(), 0);
  }
}


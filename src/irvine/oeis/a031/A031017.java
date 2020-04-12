package irvine.oeis.a031;

/**
 * A031017 <code>a(n)=least</code> k such that the base 7 representation of n begins at <code>s(k)</code>, where <code>s=A031016</code>.
 * @author Sean A. Irvine
 */
public class A031017 extends A031006 {

  /** Construct the sequence. */
  public A031017() {
    super(new A031016(), 0);
  }
}


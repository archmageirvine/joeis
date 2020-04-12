package irvine.oeis.a031;

/**
 * A031015 <code>a(n)=least</code> k such that base 7 representation of n begins at <code>s(k)</code>, where <code>s=A031007</code>.
 * @author Sean A. Irvine
 */
public class A031015 extends A031006 {

  /** Construct the sequence. */
  public A031015() {
    super(new A031007(), -1);
  }
}


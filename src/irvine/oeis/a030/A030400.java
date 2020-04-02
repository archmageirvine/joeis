package irvine.oeis.a030;

/**
 * A030400 <code>a(n)=least</code> k such that base 4 representation of n begins at <code>s(k)</code>, where <code>s=A030399</code>.
 * @author Sean A. Irvine
 */
public class A030400 extends A030378 {

  /** Construct the sequence. */
  public A030400() {
    super(new A030399(), 0);
  }
}


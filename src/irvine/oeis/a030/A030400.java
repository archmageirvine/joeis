package irvine.oeis.a030;

/**
 * A030400 a(n)=least k such that base 4 representation of n begins at s(k), where s=A030399.
 * @author Sean A. Irvine
 */
public class A030400 extends A030378 {

  /** Construct the sequence. */
  public A030400() {
    super(new A030399(), 0);
  }
}


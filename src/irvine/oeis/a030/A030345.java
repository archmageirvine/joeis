package irvine.oeis.a030;

/**
 * A030345 a(n)=least k such that base 3 representation of n begins at s(k), where s=A030341.
 * @author Sean A. Irvine
 */
public class A030345 extends A030335 {

  /** Construct the sequence. */
  public A030345() {
    super(new A030341(), -1);
  }
}


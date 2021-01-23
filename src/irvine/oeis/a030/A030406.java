package irvine.oeis.a030;

/**
 * A030406 a(n)=least k such that base 4 representation of n begins at s(k), where s=A030401.
 * @author Sean A. Irvine
 */
public class A030406 extends A030378 {

  /** Construct the sequence. */
  public A030406() {
    super(new A030401(), 0);
  }
}


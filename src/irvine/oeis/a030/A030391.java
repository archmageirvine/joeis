package irvine.oeis.a030;

/**
 * A030391 a(n)=least k such that base 4 representation of n begins at s(k), where s=A030386.
 * @author Sean A. Irvine
 */
public class A030391 extends A030378 {

  /** Construct the sequence. */
  public A030391() {
    super(new A030386(), -1);
  }
}


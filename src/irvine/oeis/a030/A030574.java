package irvine.oeis.a030;

/**
 * A030574 a(n)=least k such that base 6 representation of n begins at s(k), where s=A030567.
 * @author Sean A. Irvine
 */
public class A030574 extends A030555 {

  /** Construct the sequence. */
  public A030574() {
    super(new A030567(), -1);
  }
}


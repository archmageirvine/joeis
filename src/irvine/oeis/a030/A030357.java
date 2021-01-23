package irvine.oeis.a030;

/**
 * A030357 a(n)=least such that base 3 representation of n begins at s(k), where s=A030353.
 * @author Sean A. Irvine
 */
public class A030357 extends A030335 {

  /** Construct the sequence. */
  public A030357() {
    super(new A030353(), 0);
  }
}


package irvine.oeis.a030;

/**
 * A030311 Least k such that the base-2 representation of n begins at s(k), where s=A030308.
 * @author Sean A. Irvine
 */
public class A030311 extends A030320 {

  {
    setOffset(1);
  }

  /** Construct the sequence. */
  public A030311() {
    super(new A030308(), -1);
  }
}

package irvine.oeis.a030;

/**
 * A030367 a(n) is the least k such that the base-3 representation of n begins at s(k), where s=A030363.
 * @author Sean A. Irvine
 */
public class A030367 extends A030335 {

  /** Construct the sequence. */
  public A030367() {
    super(new A030363(), 0);
  }
}


package irvine.oeis.a030;

/**
 * A030418 Least k such that the base 4 representation of n begins at s(k), where s=A030413.
 * @author Sean A. Irvine
 */
public class A030418 extends A030378 {

  /** Construct the sequence. */
  public A030418() {
    super(new A030413(), 0);
  }
}


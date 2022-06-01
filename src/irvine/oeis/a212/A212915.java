package irvine.oeis.a212;
// manually 2020-12-30

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A212915 Number of standard Young tableaux of n cells and height &lt;= 9.
 * @author Georg Fischer
 */
public class A212915 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A212915() {
    super(0, "[[0],[22680, -47250, 33075, -9450, 945],[25452, -41928, 16773, 492, -789],[-27174, 32893, -2245, -3244, -230],[-18991, 5558, 11571, 1792, 70],[29393, 20663, 3574, 230, 5],[-40320, -12176, -1308, -60, -1]]", "[1, 1, 2, 4, 10]", 0);
  }
}

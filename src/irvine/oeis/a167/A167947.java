package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167947 Number of reduced words of length n in Coxeter group on 32 generators S_i with relations (S_i)^2 = (S_i S_j)^16 = I.
 * @author Sean A. Irvine
 */
public class A167947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167947() {
    super(new long[] {-465, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30},
      new Z[] {Z.ONE, Z.valueOf(32), Z.valueOf(992), Z.valueOf(30752), Z.valueOf(953312), Z.valueOf(29552672), Z.valueOf(916132832), Z.valueOf(28400117792L), Z.valueOf(880403651552L), Z.valueOf(27292513198112L), Z.valueOf(846067909141472L), Z.valueOf(26228105183385632L), Z.valueOf(813071260684954592L), new Z("25205209081233592352"), new Z("781361481518241362912"), new Z("24222205927065482250272")});
  }
}

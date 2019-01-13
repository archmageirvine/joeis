package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A167828.
 * @author Sean A. Irvine
 */
public class A167828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167828() {
    super(new long[] {-703, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37},
      new Z[] {Z.ONE, Z.valueOf(39), Z.valueOf(1482), Z.valueOf(56316), Z.valueOf(2140008), Z.valueOf(81320304), Z.valueOf(3090171552L), Z.valueOf(117426518976L), Z.valueOf(4462207721088L), Z.valueOf(169563893401344L), Z.valueOf(6443427949251072L), Z.valueOf(244850262071540736L), new Z("9304309958718547968"), new Z("353563778431304822784"), new Z("13435423580389583265792")});
  }
}

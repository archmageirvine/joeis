package irvine.oeis.a314;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A314225 Coordination sequence Gal.5.316.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A314225 extends TilingSequence {

  /** Construct the sequence. */
  public A314225() {
    super(0, new String[]
        { "4.4.3.3.3;B300+4,A180+2,B240-4,C0+2,C240+5"
        , "4.3.4.3.3;B180-1,D120+3,B120-3,A60+1,C300+4"
        , "3.3.3.3.3.3;C240+6,A0+4,B240-5,B60+5,A120+5,C120+1"
        , "4.3.4.3.3;D300+4,B0-2,B240+2,D60+1,E300+4"
        , "3.3.3.3.3.3;D240+5,D300+5,D0+5,D60+5,D120+5,D180+5"
        });
    defineBaseSet(0);
  }
}

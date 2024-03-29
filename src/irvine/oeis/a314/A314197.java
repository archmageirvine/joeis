package irvine.oeis.a314;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A314197 Coordination sequence Gal.5.307.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A314197 extends TilingSequence {

  /** Construct the sequence. */
  public A314197() {
    super(0, new String[]
        { "4.4.3.3.3;B0+3,A180+2,B180-3,C0+2,C240+5"
        , "4.4.3.3.3;D90+2,B0-2,A0+1,C240+4,B60-5"
        , "3.3.3.3.3.3;C240+6,A0+4,B180-4,B120+4,A120+5,C120+1"
        , "4.3.4.3.3;D300+4,B270+1,B330-1,D60+1,E300+4"
        , "3.3.3.3.3.3;D240+5,D300+5,D0+5,D60+5,D120+5,D180+5"
        });
    defineBaseSet(0);
  }
}
